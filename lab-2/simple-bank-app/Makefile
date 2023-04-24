sources := *.java
main := SimpleBankApp
out := out
docDir := doc

.PHONY: build clean run

build: $(out)

run: $(out)
	java -cp $(out) $(main)

$(out): $(sources)
	javac $(sources) -d $(out)

doc:
	javadoc -d $(docDir) $(sources)

clean:
	rm -rf $(out)
	rm -rf $(docDir)
