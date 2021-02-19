docker:
	@docker build -t java-kata-image .
	@docker run --rm -it -v$(PWD)/src:/java-kata/src java-kata-image bash

unrootify:
	sudo chown -R $$(id -u):$$(id -g) .
