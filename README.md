Simple giter8 SBT project 
===========================

This is simple giter8 sbt project skeleton, for multiple project use https://github.com/anvie/multiproject.g8

Usage
-------

```bash
$ g8 anvie/sbt-simple-project
```

Example:

```bash
Simple Project 

organization [example]: com.ansvia.nsqie
name [SimpleProject]: nsqie
scalaVersion [2.9.2]: 
version [0.0.1-alpha]: 
sbtVersion [0.12.3]: 
app_name [Main-App]: NSQie

Template applied in ./nsqie

cd nsqie

robin@canopus:~/nsqie$ sbt run
[info] Loading project definition from /home/robin/nsqie/project
[info] Updating {file:/home/robin/nsqie/project/}default-9e8b25...
[info] Resolving org.scala-sbt#precompiled-2_10_1;0.12.3 ...
[info] Done updating.
[info] Set current project to nsqie (in build file:/home/robin/nsqie/)
[info] Updating {file:/home/robin/nsqie/}default-024cb8...
[info] Resolving org.specs2#specs2-scalaz-core_2.9.2;6.0.1 ...
[info] Done updating.
[info] Compiling 1 Scala source to /home/robin/nsqie/target/classes...
[info] Running com.ansvia.nsqie.Nsqie 
Yo World!
[success] Total time: 1 s, completed Jul 31, 2013 1:31:34 AM
```

Done.

Your turn.

