package com.devicesyncagnt

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters

class MainWorker(appContext: Context, workerParams: WorkerParameters): Worker(appContext, workerParams) {
    override fun doWork(): Result {
        CommandManager.sync(applicationContext)
        return Result.success()
    }
}