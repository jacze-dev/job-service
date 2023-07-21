package com.ebookfrenzy.jobservices;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Log;

public class jobService extends JobService {
    private static final String TAG = "jobService";

    @Override
    public boolean onStartJob(JobParameters params) {
        Log.d(TAG, "onStartJob: job started successfully");
        return false;
    }

    @Override
    public boolean onStopJob(JobParameters params) {
        Log.d(TAG, "onStartJob: job stopped successfully");
        return false;
    }
}
