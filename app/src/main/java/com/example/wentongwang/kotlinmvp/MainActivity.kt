package com.example.wentongwang.kotlinmvp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.onClick

class MainActivity : AppCompatActivity(), MainView {
    val mPresenter = MainPresenter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mPresenter.setView(this)
        initView()
    }

    private fun initView() {
        button.onClick { mPresenter.hello()}
    }


    override fun showText(string: String) {
        text_view.text = string
    }
}
