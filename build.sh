if [ ! -d "build/" ]; then
  mkdir build
fi
cd src/
javac -d ../build *.java
cd ..
