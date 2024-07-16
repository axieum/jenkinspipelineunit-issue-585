import com.example.MyPipeline

def myPipeline(Map args = [:]) {
    return new MyPipeline(script: this).exec(args)
}

return this
