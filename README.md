# aws-codeartifact-maven
AWS CodeArtifact Maven


## Push (Windows)

### Step 3: Add this distribution management configuration to your pom.xml

```
<distributionManagement>
  <repository>
    <id>my-codeartifact-domain-my-repository-maven</id>
    <name>my-codeartifact-domain-my-repository-maven</name>
    <url>https://xxx.d.codeartifact.us-west-1.amazonaws.com/maven/my-repository-maven/</url>
  </repository>
</distributionManagement>
```

### Set the CodeArtificat Authorization Token to Env Variable CODEARTIFACT_TOKEN

```
aws codeartifact get-authorization-token --domain my-codeartifact-domain --query authorizationToken --output text
set CODEARTIFACT_TOKEN=xxx
```

### Create custom maven config .mvn/maven.config

```
--settings ./.mvn/local-settings.xml
```

### Create custom maven config .mvn/local-settings.xml

Note: ID must match your distributionManagement

```
<?xml version="1.0" encoding="UTF-8"?>
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
          xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0
                      https://maven.apache.org/xsd/settings-1.0.0.xsd">
    <servers>
        <server>
            <id>my-codeartifact-domain-my-repository-maven</id>
            <username>aws</username>
            <password>${env.CODEARTIFACT_TOKEN}</password>
        </server>
    </servers>
</settings>

```