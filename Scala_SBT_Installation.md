# scala_basics
This is my first intellij scala SBT project

Prerequisite Java 1.8 needed to be installed

How to run a scala program in the SBT
Follow the below steps
This is for windows users only

1.Install Scala from the following site
https://www.scala-lang.org/download/

In the above link you will have 2 download links one is scala binaries where you need to select a compatable version i suggest to download
scala 2.11.8 so that it will be compatable with spark when you try to download libraries
And the other link is scala IDE link where you will be having 2 IDE 
1.Eclipse
2.Intellij IDEA
I suggest downloading Intellij IDEA as it is much staraight forward

But downloading scala binaries is mandatory whether you download scala IDE or not
Onve you download the scala and install that you need to set the environment variables like that we do for Java
Go to -> Environment variables -> copy your scala\bin location to path -> Apply -> Save

Now got to -> Win+R -> cmd -> Type scala -version -> you can find your scala version over there

2.Download STB for windows from the following site
http://www.scala-sbt.org/download.html

Once you open the above link you will see windows MSI installer
download that and install in your PC
To check whether it got installed properly or not check in the following way

Go to -> Win+R -> cmd -> type SBT -> Hit Enter

C:\Users\bhami>sbt
Java HotSpot(TM) 64-Bit Server VM warning: ignoring option MaxPermSize=256m; support was removed in 8.0
[info] Set current project to bhami (in build file:/C:/Users/bhami/)
>

Once you did so you will find the following ">" symbol
If the symbol is not available then you have made a mistake in your installation/ the file has not been installed properly

In order to know the version installation of SBT use the following command
C:\Users\bhami>sbt sbt-version
Java HotSpot(TM) 64-Bit Server VM warning: ignoring option MaxPermSize=256m; support was removed in 8.0
[info] Set current project to bhami (in build file:/C:/Users/bhami/)
[info] 0.13.13

At the end you can check the version number 0.13.13 that is the SBT version that i have installed in my windows

so now you have installed both SCALA+SBT properly

Task1 Completed!!!!!!

