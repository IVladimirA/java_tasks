sources := *.java
main := ShirtTest
out := out

.PHONY: build clean run

build: $(out)

run: $(out)
	java -cp $(out) $(main)

$(out): $(sources)
	javac $(sources) -d $(out)

clean:
	rm -rf $(out)
