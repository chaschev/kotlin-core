package com.lightningkite.kotlin.async

/**
 * Created by jivie on 6/1/16.
 */
interface AsyncInterface {
    fun sendToThread(action: () -> Unit)
}