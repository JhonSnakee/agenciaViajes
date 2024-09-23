package com.poli.agenciaviajes.ui.photos
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager

import com.poli.agenciaviajes.databinding.FragmentPhotosBinding

class PhotosFragment : Fragment() {

    private var _binding: FragmentPhotosBinding? = null
    // Esta es una forma segura de manejar el binding que evita posibles fugas de memoria.
    private val binding get() = _binding!!

    private lateinit var photosAdapter: PhotosAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPhotosBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val photosViewModel = ViewModelProvider(this@PhotosFragment).get(PhotosViewModel::class.java)


        setupRecyclerView()

        // Observa los cambios en el LiveData del ViewModel y actualiza la lista del adapter.
        photosViewModel.photos.observe(viewLifecycleOwner) { photos ->
            photosAdapter.submitList(photos)
        }

        return root
    }

    private fun setupRecyclerView() {
        photosAdapter = PhotosAdapter { description ->
            binding.descriptionText.text = description
            binding.descriptionText.visibility = View.VISIBLE
        }

        binding.photosList.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = photosAdapter
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        // Limpia el binding cuando la vista se destruye para evitar fugas de memoria.
        _binding = null
    }
}
