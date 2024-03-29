def build_code_basic(MAVEN_CMD){
    sh "${MAVEN_CMD}"; 
}

def build_code(PATH){

    def pom_path = "pom.xml";

    if(PATH){
        pom_path = "${PATH}/pom.xml";
    }

    def maven_command = "mvn clean install --quiet -f ${pom_path}"    
      
    stage('Build/Test'){
        build_code_basic("${maven_command}");
    }
}

def build_code_openjdk11_maven360(PATH){
    build_code(PATH);
}

