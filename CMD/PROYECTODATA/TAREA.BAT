@ECHO OFF
SCHTASKS /create ^
         /sc once ^
         /tn "PROYECTO CONSOLA JAVA" ^
         /tr "C:\NetbeansProjects\PROYECTODATA\EJECUTAR.BAT" ^
         /st 00:39 ^
         /f
PAUSE