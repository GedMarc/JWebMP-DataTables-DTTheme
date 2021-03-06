package com.jwebmp.plugins.datatable.dt;

import com.jwebmp.core.base.angular.client.services.interfaces.*;
import com.jwebmp.core.base.html.*;
import com.jwebmp.plugins.datatable.*;

public class DataTableDT<T extends TableRow<?>, J extends DataTableDT<T, J>> extends DataTable<T,J>
{
	public DataTableDT(String id, TableHeaderGroup<?> headerGroup)
	{
		super(id, headerGroup);
	}
	
	public DataTableDT(String id, TableHeaderGroup<?> headerGroup, INgServiceProvider<?> dataService)
	{
		super(id, headerGroup, dataService);
	}
}
