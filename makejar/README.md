# Make Jar Package

what is test.java about?


https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof 

**in root folder**

first compile the code

```
mkdir build-jar
javac test.java -d build-jar
```

create `manifest.mf`, with content like below

```
Manifest-Version: 1.0
Main-Class: test

```

**in build-jar folder**

run 

```
jar -cvfm test.jar ../manifest.mf *
```

c: create

v: verbose

f: file (target jar file name)

m: manifest (the manifest file you should specify)

*: all .class binary file in this folder should be packed

**run the code** 

in build-jar folder, run

```
java -jar test.jar
```

**output test.jar structure**

```
/META-INF
	MANIFEST.MF
CQueue.class
test.class
MyStack.class
```

