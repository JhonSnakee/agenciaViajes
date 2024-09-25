package com.poli.agenciaviajes.ui.web

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.poli.agenciaviajes.databinding.FragmentWebBinding

class WebFragment : Fragment() {

    private var _binding: FragmentWebBinding? = null
    private val binding get() = _binding!!

    private lateinit var webView: WebView
    private lateinit var urlInput: EditText
    private lateinit var goButton: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentWebBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Configuración del WebView
        webView = binding.webView
        webView.webViewClient = WebViewClient() // Para abrir URLs dentro del WebView
        webView.settings.javaScriptEnabled = true // Habilitar JavaScript si es necesario

        // Inicialización de componentes
        urlInput = binding.urlInput
        goButton = binding.goButton

        // Manejar clic del botón "Ir"
        goButton.setOnClickListener {
            val url = urlInput.text.toString()
            if (url.isNotEmpty()) {
                webView.loadUrl(url) // Cargar la URL ingresada
            }
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
