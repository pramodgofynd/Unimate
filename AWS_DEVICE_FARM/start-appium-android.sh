#!/bin/bash

function die {
    echo $1
    exit 1
}

pkg_root_dir=`find $PWD | grep "/Config$" | head -n 1 | xargs dirname`
app_filename="$pkg_root_dir/app/app.apk"
ls -1 $app_filename || die "Did not find app in $pkg_root_dir"

appium --pre-launch --app-pkg com.amazonaws.devicefarm.android.referenceapp  --app-activity .Activities.MainActivity --platform-name Android --app $app_filename

appium --pre-launch --app-pkg co.go.fynd  --app-activity co.go.fynd.activity.AppHomeActivity --platform-name Android --app E:\fynd_web_automation_framework\src\Fynd-1.1.6.apk --device-name TA93401NDG