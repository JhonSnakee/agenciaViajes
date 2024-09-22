package com.poli.agenciaviajes.ui.video

import android.media.AudioManager
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import com.poli.agenciaviajes.R
import com.poli.agenciaviajes.databinding.FragmentVideoBinding

class VideoFragment : Fragment() {

    private var _binding: FragmentVideoBinding? = null
    private val binding get() = _binding!!
    private lateinit var mediaPlayer: MediaPlayer
    private var audioManager: AudioManager? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentVideoBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Array of video URIs
        val videoUris = arrayOf(
            Uri.parse("android.resource://" + requireContext().packageName + "/" + R.raw.bogota_vid),
            Uri.parse("android.resource://" + requireContext().packageName + "/" + R.raw.medellin_vid),
            Uri.parse("android.resource://" + requireContext().packageName + "/" + R.raw.cartagena_vid)
        )

        // Titles of the videos to display in the Spinner
        val videoTitles = arrayOf("Bogotá", "Medellín", "Cartagena")

        // Set up the spinner with video titles
        val adapter = ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, videoTitles)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        binding.videoSpinner.adapter = adapter

        // Handle video selection from the Spinner
        binding.videoSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val videoUri = videoUris[position]
                binding.videoView.setVideoURI(videoUri)

                // Set up MediaController
                val mediaController = MediaController(requireContext())
                mediaController.setAnchorView(binding.videoView)
                binding.videoView.setMediaController(mediaController)

                //binding.videoView.start() // Automatically start the video
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                // Do nothing
            }
        }

        // Handle volume control
        audioManager = requireActivity().getSystemService(AudioManager::class.java)
        val maxVolume = audioManager?.getStreamMaxVolume(AudioManager.STREAM_MUSIC)
        val currentVolume = audioManager?.getStreamVolume(AudioManager.STREAM_MUSIC)

        binding.volumeSeekbar.max = maxVolume ?: 100
        binding.volumeSeekbar.progress = currentVolume ?: 50

        binding.volumeSeekbar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                audioManager?.setStreamVolume(AudioManager.STREAM_MUSIC, progress, 0)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
