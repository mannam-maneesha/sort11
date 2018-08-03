  int n, temp;
        Scanner c = new Scanner(System.in);
        n = c.nextInt();
        int []a= new int[n];
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            for(i=0;i<n;i++)
            {
            System.out.println(a[i]+" ");
            }
         }
      }
