package com.example.wentongwang.kotlinmvp

/**
 * Created by wentongwang on 29/05/2017.
 */
interface BasePresenter<in T : BaseView> {
    fun setView(view : T)
}