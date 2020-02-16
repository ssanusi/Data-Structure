
class Stack(object):
    def __init__(self):
        self.data = []
        self.count = 0

    def push(self, item):
        self.data.append(item)
        self.count += 1

    def pop(self):
        if self.count == 0:
            return "Stack is Empty"

        data = self.data[-1]
        del self.data[-1]
        self.count -= 1
        return data

    def peek(self):
        if self.count == 0:
            return "Stack is Empty"
        return self.data[-1]

    def isEmpty(self):
        return self.count == 0

    def size(self):
        return self.count
