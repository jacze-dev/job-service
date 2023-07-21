package com.ebookfrenzy.jobservices;

import androidx.appcompat.app.AppCompatActivity;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
   int jobId = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JobInfo.Builder builder = new JobInfo.Builder(jobId,
                new ComponentName(this,jobService.class));
            builder.setMinimumLatency(1000);
            builder.setOverrideDeadline(2000);
        JobScheduler jobScheduler = (JobScheduler)getSystemService(Context.JOB_SCHEDULER_SERVICE);
        jobScheduler.schedule(builder.build());
    }
}
