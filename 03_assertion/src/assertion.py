# -*- encoding:utf-8 -*-

BIG_MONEY = 10000

def is_countable(val):
    if isinstance(val, int) or isinstance(val, float):
        return True
    else:
        return False

def show_me_the_money(dollar):
    assert dollar > 0, "Dollar have to be a positive number!"
    assert is_countable(dollar), "Dollar have to be countable data type!"

    return dollar + BIG_MONEY

def show_me_the_money_raise(dollar):
    if dollar < 0:
        raise AssertionError()
    if not is_countable(dollar):
        raise AssertionError()
    return dollar + BIG_MONEY

if __name__ == "__main__":
    my_money = -10

    print (show_me_the_money(my_money))
    print (show_me_the_money_raise(my_money))
