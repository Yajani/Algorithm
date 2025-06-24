class BrowserHistory(object):
    def __init__(self,homepage):
        
        self.list = [homepage]
        self.current_idx = 0
    
    def visit(self,url): # O(n)
        """
        :type url: str
        :rtype: None
        """
        while self.current_idx != len(self.list) - 1:
            self.list.pop()
        
        self.list.append(url)
        self.current_idx += 1
        
        return None
    
    def back(self,steps): # O(1)
        """ 
        :type steps: int
        :rtype: str
        """
        if self.current_idx < steps:
            self.current_idx = 0
        else:
            self.current_idx -= steps
        
        return self.list[self.current_idx]
    
    def forward(self,steps): # O(1)
        """
        :type steps: int
        "rtype: str
        """
        if self.current_idx + steps > len(self.list) - 1:
            self.current_idx = len(self.list) - 1
        else:
            self.current_idx += steps
        
        return self.list[self.current_idx]