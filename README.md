# jive-common-restapi-utils

Few setups to follow/check before starting on repo
1. Check your settings.xml under .m2 , you can rename existing settings.xml to say "settings1.xml" so that you have no settings.xml of your own. Other Alternative is to delete it
2. If you do step 1, make sure to restart System as well as IDE
3. 


Please clone this repository

After cloning, Follow steps:

1. mvn clean install
2. mvn clean test ( this should execute all tests, about 30 at the moment of writing this, some could fail)
3. Try running "mvn install -DskipTests" on this repo and see if you get "build success"


Alternative way of downloading/updating jar

1. Clone repo - https://github.com/trilogy-group/jive-rest-qa-openapi-utils
2. on Repo cloned in step 1, perform "mvn clean install"
3. Come back to current Repo ( repo where this readme relies ), do "mvn clean test" 


Alternatively also you can import using "maven" options ( which appears on right clicking pom.xml file )

.
