int n = 4;
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            if (j >= i)
            {
                cout << i + 1 << " ";
            }
            else
            {
                cout << "  ";
            }
        }
        cout << endl;
    }