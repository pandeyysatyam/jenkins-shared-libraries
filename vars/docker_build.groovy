def call(String ProjectName, String ImageTag, String DockerHubUser){
   sh " docker buid -t ${DockerHubuser}/${ProjectName}:${ImageTag} ."
}
