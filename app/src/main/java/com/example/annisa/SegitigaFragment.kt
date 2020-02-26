package com.example.annisa.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.annisa.R
import com.example.annisa.databinding.FragmentSegitigaBinding
import androidx.databinding.DataBindingUtil
import kotlin.math.pow
import kotlin.math.sqrt


/**
 * A simple [Fragment] subclass.
 *
 */
class SegitigaFragment : Fragment() {

    private lateinit var binding : FragmentSegitigaBinding
    private var luas = 0.0
    private var keliling = 0.0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_segitiga,container,false)

        binding.button_hitung.setOnClickListener{ check() }
        binding.button_share.setOnClickListener { share() }

        return binding.root
    }


}
