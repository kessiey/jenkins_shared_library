def call() {
    sh 'trivy image kessie/youtube:latest > trivyimage.txt'
}