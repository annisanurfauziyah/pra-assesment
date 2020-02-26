package com.example.annisa.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.annisa.R
import com.example.annisa.databinding.FragmentPersegiPanjangBinding
import android.content.Intent
import android.net.Uri
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.fragment_home.*


/**
 * A simple [Fragment] subclass.
 *
 */
class PersegiPanjangFragment : Fragment() {
    private lateinit var binding: FragmentPersegiPanjangBinding
    private var luas = 0.0
    private var keliling = 0.0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_persegi_panjang,container,false)

        binding.button_hitung.setOnClickListener{ check() }
        binding.button_share.setOnClickListener { share() }


        return binding.root
    }
    private fun check(){
        if (binding.masukanpanjang.text.isEmpty() && binding.masukkanlebar.text.isEmpty()){
            Toast.makeText(activity,"Input Tidak Boleh Kosong", Toast.LENGTH_SHORT).show()
        }
        else{
            persegipanjang()
        }
    }

}


