package com.example.wentongwang.kotlinmvp

import java.util.ArrayList

/**
 * Created by wentongwang on 29/05/2017.
 */
class MainPresenter : BasePresenter<MainView> {

    private var view : MainView? = null

    private var strList : ArrayList<String> = ArrayList()
    var count : Int = 0

    constructor(){
        strList.add("hello world!")
        strList.add("kotlin")
        strList.add("mvp")
    }

    override fun setView(view: MainView) {
        this.view = view
    }

    fun hello(){
        view?.showText(strList[count])
        count++
        count = if (count >= strList.size) 0 else count
    }

}