
class ArrayList(object):
    def __init__(self, capacity=1):
        self.count = 0
        self.capacity = capacity
        self.list = self.make_array(self.capacity)

    def __len__(self):
        return self.count

    def __str__(self, parameter_list):
        pass

    def make_array(self, new_capacity):
        return [None] * new_capacity

    def __getitem__(self, index):
        if not 0 <= index < self.count:
            return IndexError('Index out of Bound')

        return self.list[index]

    def append(self, item):
        if self.count == self.capacity:
            self._resize(2 * self.capacity)

        self.list[self.count] = item
        self.count += 1

    def _resize(self, new_capacity):
        new_list = self.make_array(new_capacity)
        for item in range(0, self.count):
            new_list[item] = self.list[item]

        self.list = new_list
        self.capacity = new_capacity

    def remove_at(self, index):
        if index < 0 or index >= self.count:
            return IndexError('Index out of bound')

        for index in range(index, self.count):
            self.list[index] = self.list[index + 1]

        self.count -= 1

    def index_of(self, searchItem):
        for item in self.list:
            if item == searchItem:
                return True

        return False

    def print(self):
        for item in self.list:
            print(item)
