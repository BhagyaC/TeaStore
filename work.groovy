def buildApp() {
    echo 'Here will go the script to build the app'
} 

def testApp() {
    echo 'Running all tests ... ex: FE and BE'
} 

def deployApp() {
    echo 'Deploying our App !!!'
    echo "Version: ${params.VERSION}"
} 

return this