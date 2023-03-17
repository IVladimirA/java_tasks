sources := *.java
main := TestGreeting

.PHONY: build clean run

build: $(main)

run: $(main)
	java $(main)

$(main): $(sources)
	javac $(sources)

clean:
	rm *.class
