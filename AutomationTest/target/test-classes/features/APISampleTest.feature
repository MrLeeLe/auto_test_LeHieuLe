Feature: API Tests Examples
	@Example
	Scenario: Query an user by email
		Given I query user by "Shanna@melissa.tv"
		When I make a query request by email
		Then the response contain:
			"""
			"username": "Antonette"
			"""
	@Example
	Scenario Outline: Show all available users and check some user email
		Given I query user 
		When I make a user request
		Then the response should contain "<user_email>"
	Examples:
		| user_email |
		| Sincere@april.biz |
		| Nathan@yesenia.net |
		| Julianne.OConner@kory.org |