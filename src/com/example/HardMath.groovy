package com.example

class HardMath implements Serializable {

    Object script = null

    int complexOperation(int a, int b) {
        script.echo "Adding ${a} to ${b}"
        return a + b
    }

}
