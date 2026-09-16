@echo off
setlocal

set JAVA_HOME=D:\Program Files\Android\Android Studio\jbr

cd /d "%~dp0"

echo Building SmartDock debug APK...

if not exist "gradlew.bat" (
    echo ERROR: gradlew.bat not found.
    exit /b 1
)

call gradlew.bat assembleDebug
if errorlevel 1 (
    echo Build failed.
    exit /b 1
)

set APK_PATH=%~dp0app\build\outputs\apk\debug\app-debug.apk

if exist "%APK_PATH%" (
    echo Build complete:
    echo %APK_PATH%
    exit /b 0
) else (
    echo Build finished but APK was not found:
    echo %APK_PATH%
    exit /b 1
)
