@ECHO OFF
CHCP 65001 > NUL
SET JAVA_HOME="C:\Program Files\Java\jdk1.8.0_291"
SET PATH=.;%JAVA_HOME%\bin;%PATH%
java -Dfile.encoding=UTF-8 -cp "C:\NetbeansProjects\PROYECTODATA\PROYECTOTRANSACCION.jar" principal.Principal
PAUSE