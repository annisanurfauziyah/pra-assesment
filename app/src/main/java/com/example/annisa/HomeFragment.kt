package com.example.annisa.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.*
import com.example.annisa.R
import androidx.databinding.DataBindingUtil
import com.example.annisa.databinding.FragmentHomeBinding


/**
 * A simple [Fragment] subclass.
 *
 */
class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentHomeBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_home, container, false
        )
        setHasOptionsMenu(true)

        binding.persegipanjang.setOnClickListener {
            it.findNavController().navigate(R.id.action_homeFragment_to_PersegiPanjangFragment)
        }

    }
}
