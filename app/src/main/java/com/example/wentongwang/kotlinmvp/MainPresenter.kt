package com.example.wentongwang.kotlinmvp

/**
 * Created by wentongwang on 29/05/2017.
 */
class MainPresenter {

    private var view : MainView? = null

    fun setView(view : MainView){
        this.view = view
    }

    fun hello(){
        view?.showText("hello world!")
    }

}