package com.poli.agenciaviajes.ui.welcome

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.poli.agenciaviajes.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment() {

    private var _binding: FragmentWelcomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val welcomeViewModel =
            ViewModelProvider(this).get(WelcomeViewModel::class.java)

        _binding = FragmentWelcomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Conectar el TextView del XML con el ViewModel
        val textView = binding.textWelcome
        welcomeViewModel.text.observe(viewLifecycleOwner) { newText ->
            textView.text = newText
        }

        // Acción del botón "Comenzar"
        binding.buttonContinue.setOnClickListener {
            Toast.makeText(requireContext(), "¡Vamos a comenzar!", Toast.LENGTH_SHORT).show()
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
