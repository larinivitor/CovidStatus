package com.projetoIF.covidStatus.ui.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.projetoIF.covidStatus.databinding.FragmentAboutBinding
import com.projetoIF.covidStatus.utils.Constants

class AboutFragment : Fragment() {

    private var _binding: FragmentAboutBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentAboutBinding.inflate(inflater, container, false)
        eventsClick()
        return binding.root
    }

    private fun eventsClick() {
        binding.btnGoRepositoryGitHun.setOnClickListener { openUrlFromIntent(Constants.ABOUT.REPOSITORY_URL) }
    }

    private fun openUrlFromIntent(url: String) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }
}