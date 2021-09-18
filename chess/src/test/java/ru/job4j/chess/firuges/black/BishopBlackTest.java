package ru.job4j.chess.firuges.black;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void position() {
        BishopBlack bb = new BishopBlack(Cell.C8);
        Cell rsl = bb.position();
        Cell expected = Cell.C8;
        Assert.assertThat(expected, is(rsl));
    }

    @Test
    public void copy() {
        BishopBlack bb = new BishopBlack(Cell.C8);
        Figure figure = bb.copy(Cell.D7);
        Cell rsl = figure.position();
        Cell expected = Cell.D7;
        Assert.assertThat(expected, is(rsl));

    }

    @Test
    public void way() {
        BishopBlack bb = new BishopBlack(Cell.C1);
        Cell[] rsl = bb.way(Cell.G5);
        Cell[] expected = new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        Assert.assertArrayEquals(expected,rsl);
    }


    @Test (expected = ImpossibleMoveException.class)
    public void isDiagonal() {
        BishopBlack bb = new BishopBlack(Cell.B2);
        bb.way(Cell.D7);
    }
}