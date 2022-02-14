1. 创建mvn项目

   1. 普通Java项目

      1. ```shell
         mvn archetype:generate
         -DgroupId=com.ruanhaiqin.smb_server
         -DartifactId=smb_server 
         ```

   2. 创建JavaWeb项目

      1. ```shell
          mvn archetype:generate
          -DgroupId=com.ruanhaiqin.web_server
          -DartifactId=webserver 
          -DarchetypeArtifactId=maven-archetype-webapp
         ```

      2. 

2. 其他项目命令

   1. mvn compile / mvn test-compile

   2. mvn test

      1. 编译并测试

   3. mvn package

   4. ```shell
      mvn clean install -Dmaven.test.skip=true<span style="font-family: Verdana, Helvetica, Arial; background-color: rgb(255, 255, 255);">  </span>
      ```

      1. 打Jar包

   5. ```shell
      mvn idea:idea
      ```

      1. 生成idea项目

   6. 

3. 常用第三方库
   1. SMB 客户端 JCIFS
      1. 
   2. WebDav实现
      1. JackRabbit  客户端和服务端实现 
      2. Sardine  客户端实现