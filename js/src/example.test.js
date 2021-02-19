const { isGameOver } = require('example');

describe ('There is nothing on the board', () => {
  const emptyBoard = [
    [null, null, null],
    [null, null, null],
    [null, null, null],
  ];

  test('The game is not over yet', () => {
    expect(isGameOver(emptyBoard))
      .toBe(false);
  });
});
