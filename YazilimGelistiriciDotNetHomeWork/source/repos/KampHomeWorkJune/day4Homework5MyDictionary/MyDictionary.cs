namespace day4Homework5MyDictionary
{
    class MyDictionary<T1, T2>
    {   
        T1[] _key;
        T1[] _tempKey;
        T2[] _value;
        T2[] _tempValue;

        public MyDictionary()
        {
            _key = new T1[0];
            _value = new T2[0];
        }

        public void Add(T1 item1, T2 item2)
        {
            System.Console.WriteLine(item1 + " : " + item2 + " eklendi.");
            _tempKey = _key;
            _key = new T1[_key.Length + 1];
            _tempValue = _value;
            _value = new T2[_value.Length + 1];
            for (int i = 0; i < _tempKey.Length; i++)
            {                
                _key[i] = _tempKey[i];
                _value[i] = _tempValue[i];                
            }
            _value[_value.Length - 1] = item2;
            _key[_key.Length - 1] = item1;            
        }
        public int Count
        {
            get { return _key.Length; }
        }
    }
}