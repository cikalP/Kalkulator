package com.example.kalkulatorsederhana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kalkulatorsederhana.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.btnPlus.setOnClickListener(){
            tambah()
        }
        binding.btnMin.setOnClickListener(){
            kurang()
        }
        binding.btnDist.setOnClickListener(){
            bagi()
        }
        binding.btnMult.setOnClickListener(){
            kali()
        }
        binding.btnClear.setOnClickListener(){
            hapus()
        }
        setContentView(binding.root)
    }
    private fun tambah(){
        var inp1 = binding.etInp1.text.toString().toInt()
        var inp2 = binding.etInp2.text.toString().toInt()
        var hasil = inp1 + inp2
        binding.tvHasil.text = "${inp1} + ${inp2} = ${hasil}"
    }
    private fun kurang(){
        var inp1 = binding.etInp1.text.toString().toInt()
        var inp2 = binding.etInp2.text.toString().toInt()
        var hasil = inp1 - inp2
        binding.tvHasil.text = "${inp1} - ${inp2} = ${hasil}"
    }
    private fun bagi(){
        var inp1 = binding.etInp1.text.toString().toInt()
        var inp2 = binding.etInp2.text.toString().toInt()
        var hasil = inp1 / inp2
        binding.tvHasil.text = "${inp1} / ${inp2} = ${hasil}"
    }
    private fun kali(){
        var inp1 = binding.etInp1.text.toString().toInt()
        var inp2 = binding.etInp2.text.toString().toInt()
        var hasil = inp1 * inp2
        binding.tvHasil.text = "${inp1} * ${inp2} = ${hasil}"
    }
    private fun hapus(){
        binding.etInp1.text.clear()
        binding.etInp2.text.clear()
        binding.tvHasil.text = "Hasil"
    }
}