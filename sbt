"$JAVA_HOME"/bin/java -Xms4096M -Xmx8000M -Xss1M -XX:+CMSClassUnloadingEnabled -XX:MaxPermSize=1024M -Dfile.encoding=UTF-8 -Djava.awt.headless=true -jar `dirname $0`/launcher/sbt-launch.jar "$@"
