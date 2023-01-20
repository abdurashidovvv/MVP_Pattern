package com.abdurashidov.mvp_pattern.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.abdurashidov.mvp_pattern.databinding.ActivityMainBinding
import com.abdurashidov.mvp_pattern.model.Model
import com.abdurashidov.mvp_pattern.presenter.Contract
import com.abdurashidov.mvp_pattern.presenter.Presenter

class MainActivity : AppCompatActivity(), Contract.View {
    private lateinit var binding: ActivityMainBinding
    private var presenter:Presenter?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        presenter=Presenter(this, Model())
        binding.button.setOnClickListener { presenter!!.onButtonClick()}
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter?.onDestroy()
    }

    override fun showProgress() {
        binding.progressBar.visibility=View.VISIBLE
        binding.textView.visibility=View.INVISIBLE
    }

    override fun hideProgress() {
        binding.progressBar.visibility=View.INVISIBLE
        binding.textView.visibility=View.VISIBLE
    }

    override fun setString(string: String?) {
        binding.textView.text=string
    }
}