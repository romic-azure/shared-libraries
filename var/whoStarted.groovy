// vars/whoStarted.groovy
def call() {
    echo "This job was started by ${currentBuild.rawBuild.getCauses()[0].getUserId()}"
}