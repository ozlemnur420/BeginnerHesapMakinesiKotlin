package com.example.hesapmakinesi
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.hesapmakinesi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var numara1: Double? = null
    var numara2: Double? = null
    var sonuc: Double? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)  // Görünüm burada ayarlanıyor.
    }

    fun topla(view: View) {
        numara1 = binding.number1Text.text.toString().toDoubleOrNull()
        numara2 = binding.number2Text.text.toString().toDoubleOrNull()

        if (numara1 != null && numara2 != null) {
            sonuc = numara1!! + numara2!!
            binding.sonucText.text = "Sonuç: $sonuc"
        } else {
            binding.sonucText.text = "Numaraları giriniz!"
        }
    }

    fun bol(view: View) {
        numara1 = binding.number1Text.text.toString().toDoubleOrNull()
        numara2 = binding.number2Text.text.toString().toDoubleOrNull()

        if (numara1 != null && numara2 != null) {
            if (numara2 != 0.0) {
                sonuc = numara1!! / numara2!!
                binding.sonucText.text = "Sonuç: $sonuc"
            } else {
                binding.sonucText.text = "Sıfıra bölme hatası!"
            }
        } else {
            binding.sonucText.text = "Numaraları giriniz!"
            //binding.sonucText.text ifadesi, ActivityMainBinding nesnesi üzerinden tanımlanan sonucText adlı
            // bir TextView bileşeninin text özelliğine erişimi ifade eder.
        }
    }

    fun carp(view: View) {
        numara1 = binding.number1Text.text.toString().toDoubleOrNull()
        numara2 = binding.number2Text.text.toString().toDoubleOrNull()

        if (numara1 != null && numara2 != null) {
            sonuc = numara1!! * numara2!!
            binding.sonucText.text = "Sonuç: $sonuc"
        } else {
            binding.sonucText.text = "Numaraları giriniz!"
        }
    }

    fun cikar(view: View) {
        numara1 = binding.number1Text.text.toString().toDoubleOrNull()
        numara2 = binding.number2Text.text.toString().toDoubleOrNull()

        if (numara1 != null && numara2 != null) {
            sonuc = numara1!! - numara2!!
            binding.sonucText.text = "Sonuç: $sonuc"
        } else {
            binding.sonucText.text = "Numaraları giriniz!"
        }
    }
}
