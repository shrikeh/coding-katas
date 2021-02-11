docker:
	@docker build -t js-kata-image .
	@docker run --rm -it -v$(PWD)/src:/js-kata/src js-kata-image bash -c 'npm test -- --watchAll'


unrootify:
	sudo chown -R $$(id -u):$$(id -g) .
