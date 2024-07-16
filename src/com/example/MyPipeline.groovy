package com.example

class MyPipeline implements Serializable {

    Object script = null

    def exec(Map args = [:]) {
        script.node {
            stage('Example') {
                echo 'Hello, world!'
                def result = complexOperation(1, 2) // <-- StackOverflowError
                echo "The sum is ${result}"
            }
        }
    }

}
